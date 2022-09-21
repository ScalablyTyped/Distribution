package typings.zdog.mod

import typings.zdog.zdogBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Shape")
@js.native
open class Shape () extends Anchor {
  def this(options: ShapeOptions) = this()
  
  /** @see {@link ShapeOptions#backface} */
  var backface: Boolean | String = js.native
  
  /** @see {@link ShapeOptions#closed} */
  var closed: Boolean = js.native
  
  /** @see {@link ShapeOptions#color} */
  var color: String = js.native
  
  def copy(options: ShapeOptions): Shape = js.native
  
  def copyGraph(options: ShapeOptions): Shape = js.native
  
  /** @see {@link ShapeOptions#fill} */
  var fill: Boolean = js.native
  
  /** @see {@link ShapeOptions#front} */
  var front: Vector = js.native
  
  /** @see {@link ShapeOptions#stroke} */
  var stroke: Double | `false` = js.native
  
  /**
    * Updates the shape path.
    * Trigger `updatePath()` after you change a point on a `Shape`’s path, a {@link Rect}’s width or height, etc.
    * @see {@link https://zzz.dog/api#shape-updatepath Zdog API}
    */
  def updatePath(): Unit = js.native
  
  /** @see {@link ShapeOptions#visible} */
  var visible: Boolean = js.native
}
