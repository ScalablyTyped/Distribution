package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends js.Object {
  
  /**
    * Sets a JavaScript function/portion of code that will be executed when the respective menu item is selected. "doSomething()" | "ale
    * rt(1)" | ...
    */
  var function: js.UndefOr[String] = js.native
  
  /**
    * Sets the ID of the menu item. "myid" | "f1" | ...
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Sets the text for the menu item. "New Menu Item" | ...
    */
  var text: js.UndefOr[String] = js.native
}
