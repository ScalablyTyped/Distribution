package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Box")
@js.native
class Box () extends Rect {
  def this(options: BoxOptions) = this()
  /** @see {@link BoxOptions#bottomFace} */
  var bottomFace: scala.Boolean | java.lang.String = js.native
  /** @see {@link BoxOptions#depth} */
  var depth: scala.Double = js.native
  /** @see {@link BoxOptions#frontFace} */
  var frontFace: scala.Boolean | java.lang.String = js.native
  /** @see {@link BoxOptions#leftFace} */
  var leftFace: scala.Boolean | java.lang.String = js.native
  /** @see {@link BoxOptions#rearFace} */
  var rearFace: scala.Boolean | java.lang.String = js.native
  /** @see {@link BoxOptions#rightFace} */
  var rightFace: scala.Boolean | java.lang.String = js.native
  /** @see {@link BoxOptions#topFace} */
  var topFace: scala.Boolean | java.lang.String = js.native
}

