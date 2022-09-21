package typings.zdog.mod

import typings.std.CanvasRenderingContext2D
import typings.std.SVGSVGElement
import typings.zdog.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def TAU: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TAU").asInstanceOf[Double]

inline def easeInOut(alpha: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def easeInOut(alpha: Double, power: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any], power.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def extend[T](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any]).asInstanceOf[T]
inline def extend[T](a: T, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]

inline def lerp(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def modulo(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

type DragEndListener = js.ThisFunction0[/* this */ Dragger, Unit]

type DragMoveListener = js.ThisFunction3[
/* this */ Dragger, 
/* pointer */ PointerPosition, 
/* moveX */ Double, 
/* moveY */ Double, 
Unit]

type DragStartListener = js.ThisFunction1[/* this */ Dragger, /* pointer */ PointerPosition, Unit]

type PrerenderListener = js.ThisFunction1[
/* this */ Illustration, 
/* context */ CanvasRenderingContext2D | SVGSVGElement, 
Unit]

type ResizeListener = js.ThisFunction2[/* this */ Illustration, /* width */ Double, /* height */ Double, Unit]
