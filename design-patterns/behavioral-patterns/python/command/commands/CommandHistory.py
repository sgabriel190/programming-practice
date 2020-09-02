from commands.Command import Command


class CommandHistory:

    __history = None

    def __init__(self):
        self.__history = list()

    def push(self, c: Command):
        self.__history.append(c)

    def pop(self) -> Command:
        return self.__history.pop()
