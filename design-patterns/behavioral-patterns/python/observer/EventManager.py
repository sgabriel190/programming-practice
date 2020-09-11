class EventManager:
    __listeners = None

    def __init__(self):
        self.__listeners = {}

    def subscribe(self, eventType, listener):
        if eventType in self.__listeners:
            self.__listeners[eventType].append(listener)
        else:
            self.__listeners[eventType] = [listener]

    def unsubscribe(self, eventType, listener):
        listeners: list = self.__listeners.pop(eventType)
        if listener in listeners:
            listeners.remove(listener)
        if len(listeners) > 0:
            self.__listeners[eventType] = listeners

    def notify(self, eventType, data):
        if eventType in self.__listeners:
            for sub in self.__listeners[eventType]:
                sub.update(eventType + "\t" + data)
