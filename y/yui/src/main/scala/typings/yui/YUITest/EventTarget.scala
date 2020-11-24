package typings.yui.YUITest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends js.Object {
  
  def attach(`type`: String, listener: js.Function): Unit = js.native
  
  def detach(`type`: String, listener: js.Function): Unit = js.native
  
  def fire(event: String): Unit = js.native
  def fire(event: js.Object): Unit = js.native
  
  def subscribe(`type`: String, listener: js.Function): Unit = js.native
  
  def unsubscribe(`type`: String, listener: js.Function): Unit = js.native
}
