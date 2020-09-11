from EventListener import EventListener


class EmailAlertsListener(EventListener):

    def update(self, filename):
        print("Object:{} was notified with \"{}\" information.".format(self, filename))
