package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yoga-layout", "Size")
@js.native
class Size protected () extends js.Object {
  def this(width: scala.Double, height: scala.Double) = this()
  val height: scala.Double = js.native
  val width: scala.Double = js.native
  def fromJS(expose: js.Function2[/* width */ scala.Double, /* height */ scala.Double, _]): scala.Unit = js.native
}

/* static members */
@JSImport("yoga-layout", "Size")
@js.native
object Size extends js.Object {
  def fromJS(dim: yogaDashLayoutLib.Anon_Height): yogaDashLayoutLib.yogaDashLayoutMod.Size = js.native
}

