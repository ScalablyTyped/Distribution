package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Box")
@js.native
class Box () extends Rect {
  def this(options: BoxOptions) = this()
  /** @see {@link BoxOptions#bottomFace} */
  var bottomFace: Boolean | String = js.native
  /** @see {@link BoxOptions#depth} */
  var depth: Double = js.native
  /** @see {@link BoxOptions#frontFace} */
  var frontFace: Boolean | String = js.native
  /** @see {@link BoxOptions#leftFace} */
  var leftFace: Boolean | String = js.native
  /** @see {@link BoxOptions#rearFace} */
  var rearFace: Boolean | String = js.native
  /** @see {@link BoxOptions#rightFace} */
  var rightFace: Boolean | String = js.native
  /** @see {@link BoxOptions#topFace} */
  var topFace: Boolean | String = js.native
}

