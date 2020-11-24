package typings.zrender

import org.scalablytyped.runtime.Instantiable6
import typings.zrender.anon.AddColorStop
import typings.zrender.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("zrender")
@js.native
object zrender extends js.Object {
  
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  @js.native
  trait LinearGradient
    extends Instantiable6[
          /* x */ js.UndefOr[X], 
          /* y */ js.UndefOr[Y], 
          /* x2 */ js.UndefOr[X2], 
          /* y2 */ js.UndefOr[Y2], 
          /* colorStops */ js.UndefOr[ColorStops], 
          /* globalCoord */ js.UndefOr[GlobalCoords], 
          AddColorStop
        ]
  
  type ColorStops = js.Array[Color]
  
  type GlobalCoords = Boolean
  
  type X = Double
  
  type X2 = Double
  
  type Y = Double
  
  type Y2 = Double
}
