package typings.zdog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DragEndListener = js.ThisFunction0[/* this */ typings.zdog.mod.Dragger, scala.Unit]
  type DragMoveListener = js.ThisFunction3[
    /* this */ typings.zdog.mod.Dragger, 
    /* pointer */ typings.zdog.mod.PointerPosition, 
    /* moveX */ scala.Double, 
    /* moveY */ scala.Double, 
    scala.Unit
  ]
  type DragStartListener = js.ThisFunction1[
    /* this */ typings.zdog.mod.Dragger, 
    /* pointer */ typings.zdog.mod.PointerPosition, 
    scala.Unit
  ]
  type PrerenderListener = js.ThisFunction1[
    /* this */ typings.zdog.mod.Illustration, 
    /* context */ typings.std.CanvasRenderingContext2D | typings.std.SVGSVGElement, 
    scala.Unit
  ]
  type ResizeListener = js.ThisFunction2[
    /* this */ typings.zdog.mod.Illustration, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
}
