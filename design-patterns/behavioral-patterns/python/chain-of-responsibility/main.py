"""
    CHAIN OF RESPONSIBILITY PATTERN (CoR; Chain of Command)
    -> Is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request,
    each handler decides either to process the request or to pass it to the next handler in the chain.
    -> Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests
    in various ways, but the exact types of requests and their sequences are unknown beforehand.
    -> Use the pattern when it's essential to execute several handlers in a particular order.
    -> Use CoR pattern when the set of handlers and their order are supposed to change at runtime.
"""
from components.Button import Button
from containers.Dialog import Dialog
from containers.Panel import Panel

if __name__ == "__main__":
    dialog = Dialog()
    dialog.tooltipText = "https://google.com"
    panel = Panel()
    panel.tooltipText = "This panel is a dummy panel."
    ok_button = Button(200, 100, 5, 5)
    ok_button.tooltipText = "This is an OK button dummy."
    cancel_button = Button(100, 100, 10, 10)
    cancel_button.tooltipText = "This is a cancel button dummy."

    ok_button.setContainer(panel)
    cancel_button.setContainer(panel)
    panel.setContainer(dialog)

    dialog.showHelp()
    panel.showHelp()
    ok_button.showHelp()
    cancel_button.showHelp()
