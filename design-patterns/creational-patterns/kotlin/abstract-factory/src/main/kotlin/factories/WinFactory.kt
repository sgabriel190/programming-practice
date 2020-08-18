package factories

import buttons.Button
import buttons.WinButton
import checkboxes.Checkbox
import checkboxes.WinCheckbox

class WinFactory: GUIFactory {
    override fun createButton(): Button {
        return WinButton()
    }

    override fun createCheckbox(): Checkbox {
        return WinCheckbox()
    }
}