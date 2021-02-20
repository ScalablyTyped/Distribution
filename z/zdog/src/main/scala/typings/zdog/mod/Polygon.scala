package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Polygon")
@js.native
class Polygon () extends Shape {
  def this(options: PolygonOptions) = this()
  
  def copy(options: PolygonOptions): Polygon = js.native
  
  def copyGraph(options: PolygonOptions): Polygon = js.native
  
  /** @see {@link PolygonOptions#radius} */
  val radius: js.UndefOr[Double] = js.native
  
  /** @see {@link PolygonOptions#sides} */
  val sides: js.UndefOr[Double] = js.native
}
