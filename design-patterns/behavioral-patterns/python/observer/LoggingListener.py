from EventListener import EventListener


class LoggingListener(EventListener):

    def update(self, filename):
        print("Object:{} was notified with \"{}\" information.".format(self, filename))
