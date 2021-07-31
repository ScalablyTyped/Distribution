package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMenu extends StObject {
  
  def add(element: JQuery, items: js.Array[TreeNode]): Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: Boolean): Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: Boolean, disabledAnimate: Boolean): Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: Unit, disabledAnimate: Boolean): Unit = js.native
  
  def collapse(): Unit = js.native
  def collapse(params: Unit, disableAnimate: Boolean): Unit = js.native
  def collapse(params: JQuery): Unit = js.native
  def collapse(params: JQuery, disableAnimate: Boolean): Unit = js.native
  
  def empty(): Unit = js.native
  
  def expand(): Unit = js.native
  def expand(params: Unit, disableAnimate: Boolean): Unit = js.native
  def expand(params: JQuery): Unit = js.native
  def expand(params: JQuery, disableAnimate: Boolean): Unit = js.native
  
  def reload(data: js.Array[TreeNode]): Unit = js.native
  
  def remove(): Unit = js.native
  
  def show(): Unit = js.native
  def show(params: Unit, disableAnimate: Boolean): Unit = js.native
  def show(params: JQuery): Unit = js.native
  def show(params: JQuery, disableAnimate: Boolean): Unit = js.native
  
  def toData(): js.Object = js.native
  def toData($ul: Unit, filter: String): js.Object = js.native
  def toData($ul: JQuery): js.Object = js.native
  def toData($ul: JQuery, filter: String): js.Object = js.native
  
  def toggle(): Unit = js.native
  def toggle(params: Unit, disableAnimate: Boolean): Unit = js.native
  def toggle(params: JQuery): Unit = js.native
  def toggle(params: JQuery, disableAnimate: Boolean): Unit = js.native
}
