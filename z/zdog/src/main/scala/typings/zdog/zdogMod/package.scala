package typings.zdog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zdogMod {
  import typings.std.CanvasRenderingContext2D
  import typings.std.SVGSVGElement

  type DragEndListener = js.ThisFunction0[/* this */ Dragger, Unit]
  type DragMoveListener = js.ThisFunction3[
    /* this */ Dragger, 
    /* pointer */ PointerPosition, 
    /* moveX */ Double, 
    /* moveY */ Double, 
    Unit
  ]
  type DragStartListener = js.ThisFunction1[/* this */ Dragger, /* pointer */ PointerPosition, Unit]
  type PrerenderListener = js.ThisFunction1[
    /* this */ Illustration, 
    /* context */ CanvasRenderingContext2D | SVGSVGElement, 
    Unit
  ]
  type ResizeListener = js.ThisFunction2[/* this */ Illustration, /* width */ Double, /* height */ Double, Unit]
}
