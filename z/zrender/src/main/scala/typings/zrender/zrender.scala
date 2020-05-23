package typings.zrender

import org.scalablytyped.runtime.Instantiable6
import typings.zrender.anon.AddColorStop
import typings.zrender.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zrender")
@js.native
object zrender extends js.Object {
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  @js.native
  trait LinearGradient
    extends Instantiable6[
          js.UndefOr[/* x */ X], 
          js.UndefOr[/* y */ Y], 
          js.UndefOr[/* x2 */ X2], 
          js.UndefOr[/* y2 */ Y2], 
          js.UndefOr[/* colorStops */ ColorStops], 
          js.UndefOr[/* globalCoord */ GlobalCoords], 
          AddColorStop
        ]
  
  type ColorStops = js.Array[Color]
  type GlobalCoords = Boolean
  type X = Double
  type X2 = Double
  type Y = Double
  type Y2 = Double
}

