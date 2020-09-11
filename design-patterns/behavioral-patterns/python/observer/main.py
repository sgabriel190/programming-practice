"""
    OBSERVER PATTERN (Event-Subscriber; Listener)
    -> Is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about
    any events that happen to the object they're observing.
    -> Use the Observer pattern when changes to the state of one object may require changing other objects, and the
    actual set of objects is unknown beforehand or changes dynamically.
    -> Use the pattern when some objects in your app must observe others, but only for a limited time or in
    specific cases.
    ->
"""
from Editor import Editor
from EmailAlertsListener import EmailAlertsListener
from EventManager import EventManager
from LoggingListener import LoggingListener


def emmitEvent(publisher):
    publisher.saveFile()
    publisher.openFile()


if __name__ == "__main__":
    eventListener = EventManager()
    log1 = LoggingListener()
    log2 = LoggingListener()
    emailAlert1 = EmailAlertsListener()
    emailAlert2 = EmailAlertsListener()
    eventListener.subscribe("open", log1)
    eventListener.subscribe("save", log2)
    eventListener.subscribe("save", emailAlert1)
    eventListener.subscribe("save", emailAlert2)

    editor = Editor(eventListener, "text.txt")

    emmitEvent(editor)

    editor.events.unsubscribe("save", emailAlert2)
    print("\n")
    emmitEvent(editor)

