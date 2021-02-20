package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Ellipse")
@js.native
class Ellipse () extends Shape {
  def this(options: EllipseOptions) = this()
  
  def copy(options: EllipseOptions): Ellipse = js.native
  
  def copyGraph(options: EllipseOptions): Ellipse = js.native
  
  /** @see {@link EllipseOptions#diameter} */
  var diameter: Double = js.native
  
  /** @see {@link EllipseOptions#height} */
  var height: js.UndefOr[Double] = js.native
  
  /** @see {@link EllipseOptions#quarters} */
  var quarters: QuartersValue = js.native
  
  /** @see {@link EllipseOptions#width} */
  var width: js.UndefOr[Double] = js.native
}
