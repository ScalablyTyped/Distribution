package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Rect")
@js.native
class Rect () extends Shape {
  def this(options: RectOptions) = this()
  
  def copy(options: RectOptions): Rect = js.native
  
  def copyGraph(options: RectOptions): Rect = js.native
  
  /** @see {@link RectOptions#height} */
  var height: Double = js.native
  
  /** @see {@link RectOptions#width} */
  var width: Double = js.native
}
