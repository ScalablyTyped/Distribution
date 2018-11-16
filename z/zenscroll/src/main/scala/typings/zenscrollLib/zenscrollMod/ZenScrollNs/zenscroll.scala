package typings
package zenscrollLib.zenscrollMod.ZenScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait zenscroll extends js.Object {
  def center(elem: stdLib.HTMLElement): scala.Unit = js.native
  def center(elem: stdLib.HTMLElement, duration: scala.Double): scala.Unit = js.native
  def center(elem: stdLib.HTMLElement, duration: scala.Double, offset: scala.Double): scala.Unit = js.native
  def center(
    elem: stdLib.HTMLElement,
    duration: scala.Double,
    offset: scala.Double,
    onDone: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def createScroller(scrollContainer: stdLib.HTMLElement): zenscroll = js.native
  def createScroller(scrollContainer: stdLib.HTMLElement, defaultDuration: scala.Double): zenscroll = js.native
  def createScroller(scrollContainer: stdLib.HTMLElement, defaultDuration: scala.Double, edgeOffset: scala.Double): zenscroll = js.native
  def getTopOf(elem: stdLib.HTMLElement): scala.Double = js.native
  def getY(): scala.Double = js.native
  def intoView(elem: stdLib.HTMLElement): scala.Unit = js.native
  def intoView(elem: stdLib.HTMLElement, duration: scala.Double): scala.Unit = js.native
  def intoView(elem: stdLib.HTMLElement, duration: scala.Double, onDone: js.Function0[scala.Unit]): scala.Unit = js.native
  def moving(): scala.Boolean = js.native
  def setup(): setupOption = js.native
  def setup(defaultDuration: scala.Double): setupOption = js.native
  def setup(defaultDuration: scala.Double, edgeOffset: scala.Double): setupOption = js.native
  def stop(): scala.Unit = js.native
  def to(elem: stdLib.HTMLElement): scala.Unit = js.native
  def to(elem: stdLib.HTMLElement, duration: scala.Double): scala.Unit = js.native
  def to(elem: stdLib.HTMLElement, duration: scala.Double, onDone: js.Function0[scala.Unit]): scala.Unit = js.native
  def toY(targetY: scala.Double): scala.Unit = js.native
  def toY(targetY: scala.Double, duration: scala.Double): scala.Unit = js.native
  def toY(targetY: scala.Double, duration: scala.Double, onDone: js.Function0[scala.Unit]): scala.Unit = js.native
}

