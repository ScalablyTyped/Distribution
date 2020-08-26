package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMenu extends js.Object {
  def add(element: JQuery, items: js.Array[TreeNode]): Unit = js.native
  def add(
    element: JQuery,
    items: js.Array[TreeNode],
    expand: js.UndefOr[scala.Nothing],
    disabledAnimate: Boolean
  ): Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: Boolean): Unit = js.native
  def add(element: JQuery, items: js.Array[TreeNode], expand: Boolean, disabledAnimate: Boolean): Unit = js.native
  def collapse(): Unit = js.native
  def collapse(params: js.UndefOr[scala.Nothing], disableAnimate: Boolean): Unit = js.native
  def collapse(params: JQuery): Unit = js.native
  def collapse(params: JQuery, disableAnimate: Boolean): Unit = js.native
  def empty(): Unit = js.native
  def expand(): Unit = js.native
  def expand(params: js.UndefOr[scala.Nothing], disableAnimate: Boolean): Unit = js.native
  def expand(params: JQuery): Unit = js.native
  def expand(params: JQuery, disableAnimate: Boolean): Unit = js.native
  def reload(data: js.Array[TreeNode]): Unit = js.native
  def remove(): Unit = js.native
  def show(): Unit = js.native
  def show(params: js.UndefOr[scala.Nothing], disableAnimate: Boolean): Unit = js.native
  def show(params: JQuery): Unit = js.native
  def show(params: JQuery, disableAnimate: Boolean): Unit = js.native
  def toData(): js.Object = js.native
  def toData($ul: js.UndefOr[scala.Nothing], filter: String): js.Object = js.native
  def toData($ul: JQuery): js.Object = js.native
  def toData($ul: JQuery, filter: String): js.Object = js.native
  def toggle(): Unit = js.native
  def toggle(params: js.UndefOr[scala.Nothing], disableAnimate: Boolean): Unit = js.native
  def toggle(params: JQuery): Unit = js.native
  def toggle(params: JQuery, disableAnimate: Boolean): Unit = js.native
}

