package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "RoundedRect")
@js.native
open class RoundedRect () extends Shape {
  def this(options: RoundedRectOptions) = this()
  
  def copy(options: RoundedRectOptions): RoundedRect = js.native
  
  def copyGraph(options: RoundedRectOptions): RoundedRect = js.native
  
  /** {@link RectOptions#cornerRadius} */
  var cornerRadius: Double = js.native
  
  /** {@link RectOptions#height} */
  var height: Double = js.native
  
  /** {@link RectOptions#width} */
  var width: Double = js.native
}
