package typings.zrender

import typings.zrender.zrender.CanvasLineCap
import typings.zrender.zrender.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zrenderStrings {
  
  @js.native
  sealed trait bevel
    extends StObject
       with CanvasLineJoin
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait butt
    extends StObject
       with CanvasLineCap
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait dashed extends StObject
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait dotted extends StObject
  inline def dotted: dotted = "dotted".asInstanceOf[dotted]
  
  @js.native
  sealed trait linear extends StObject
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait miter
    extends StObject
       with CanvasLineJoin
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait `no-repeat`
    extends StObject
       with ImagePatternRepeat
  inline def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait repeat
    extends StObject
       with ImagePatternRepeat
  inline def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x`
    extends StObject
       with ImagePatternRepeat
  inline def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y`
    extends StObject
       with ImagePatternRepeat
  inline def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait round
    extends StObject
       with CanvasLineCap
       with CanvasLineJoin
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait solid extends StObject
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait square
    extends StObject
       with CanvasLineCap
  inline def square: square = "square".asInstanceOf[square]
}
