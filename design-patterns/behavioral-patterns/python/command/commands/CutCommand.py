from commands.Command import Command


class CutCommand(Command):

    def __init__(self, app, editor):
        super().__init__(app, editor)

    def execute(self):
        print("Message from {}.execute() method.\nEditor:{}\nInvoker:{}\n\n".format(self.__class__.__name__,
                                                                                    self._editor.__dict__,
                                                                                    self._app.__dict__))
        self.saveBackup()
        self._app.clipboard = self._editor.getSelection()
        self._editor.deleteSelection()
        return True
