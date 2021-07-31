package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def TAU: scala.Double = typings.zdog.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TAU").asInstanceOf[scala.Double]

@scala.inline
def easeInOut(alpha: scala.Double): scala.Double = typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
@scala.inline
def easeInOut(alpha: scala.Double, power: scala.Double): scala.Double = (typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any], power.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def extend[T](a: T): T = typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any]).asInstanceOf[T]
@scala.inline
def extend[T](a: T, b: T): T = (typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def lerp(a: scala.Double, b: scala.Double, alpha: scala.Double): scala.Double = (typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def modulo(a: scala.Double, b: scala.Double): scala.Double = (typings.zdog.mod.^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

type DragEndListener = js.ThisFunction0[/* this */ typings.zdog.mod.Dragger, scala.Unit]

type DragMoveListener = js.ThisFunction3[
/* this */ typings.zdog.mod.Dragger, 
/* pointer */ typings.zdog.mod.PointerPosition, 
/* moveX */ scala.Double, 
/* moveY */ scala.Double, 
scala.Unit]

type DragStartListener = js.ThisFunction1[
/* this */ typings.zdog.mod.Dragger, 
/* pointer */ typings.zdog.mod.PointerPosition, 
scala.Unit]

type PrerenderListener = js.ThisFunction1[
/* this */ typings.zdog.mod.Illustration, 
/* context */ typings.std.CanvasRenderingContext2D | typings.std.SVGSVGElement, 
scala.Unit]

type ResizeListener = js.ThisFunction2[
/* this */ typings.zdog.mod.Illustration, 
/* width */ scala.Double, 
/* height */ scala.Double, 
scala.Unit]
