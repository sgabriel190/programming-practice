from components.Widget import Widget


class Component(Widget):

    def showHelp(self) -> None:
        if self.tooltipText is not None:
            print("Message from {} with tooltip:{} and container:{}. Dict:{}".format(self.__class__, self.tooltipText,
                                                                                     self._container, self.__dict__))
        else:
            self._container.showHelp()

    def setContainer(self, container) -> None:
        self._container = container
