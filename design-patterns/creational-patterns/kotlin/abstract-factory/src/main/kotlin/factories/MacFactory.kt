package factories

import buttons.Button
import buttons.MacButton
import checkboxes.Checkbox
import checkboxes.MacCheckbox

class MacFactory: GUIFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}