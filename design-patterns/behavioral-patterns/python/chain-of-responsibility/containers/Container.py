from components.Widget import Widget


class Container(Widget):

    _container: Widget = None

    def setContainer(self, container: Widget):
        self._container = container

    def showHelp(self) -> None:
        if self.tooltipText is not None:
            print("Message from {} with tooltip:{} and container:{}. Dict:{}".format(self.__class__, self.tooltipText,
                                                                                     self.__class__.__name__,
                                                                                     self.__dict__))
        else:
            self._container.showHelp()
