package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFunction extends js.Object {
  /**
    * Sets a JavaScript function/portion of code that will be executed when the respective menu item is selected. "doSomething()" | "ale
    * rt(1)" | ...
    */
  var function: js.UndefOr[String] = js.undefined
  /**
    * Sets the ID of the menu item. "myid" | "f1" | ...
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Sets the text for the menu item. "New Menu Item" | ...
    */
  var text: js.UndefOr[String] = js.undefined
}

object AnonFunction {
  @scala.inline
  def apply(function: String = null, id: String = null, text: String = null): AnonFunction = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunction]
  }
}

