package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMenu extends js.Object {
  def add(element: JQuery, items: js.Array[TreeNode]): scala.Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: scala.Boolean): scala.Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: scala.Boolean, disabledAnimate: scala.Boolean): scala.Unit = js.native
  def collapse(): scala.Unit = js.native
  def collapse(params: JQuery): scala.Unit = js.native
  def collapse(params: JQuery, disableAnimate: scala.Boolean): scala.Unit = js.native
  def empty(): scala.Unit = js.native
  def expand(): scala.Unit = js.native
  def expand(params: JQuery): scala.Unit = js.native
  def expand(params: JQuery, disableAnimate: scala.Boolean): scala.Unit = js.native
  def reload(data: js.Array[TreeNode]): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(params: JQuery): scala.Unit = js.native
  def show(params: JQuery, disableAnimate: scala.Boolean): scala.Unit = js.native
  def toData(): js.Object = js.native
  def toData($ul: JQuery): js.Object = js.native
  def toData($ul: JQuery, filter: java.lang.String): js.Object = js.native
  def toggle(): scala.Unit = js.native
  def toggle(params: JQuery): scala.Unit = js.native
  def toggle(params: JQuery, disableAnimate: scala.Boolean): scala.Unit = js.native
}

