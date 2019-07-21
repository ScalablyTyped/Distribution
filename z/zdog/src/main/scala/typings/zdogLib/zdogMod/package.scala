package typings
package zdogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zdogMod {
  type DragEndListener = js.ThisFunction0[/* this */ Dragger, scala.Unit]
  type DragMoveListener = js.ThisFunction3[
    /* this */ Dragger, 
    /* pointer */ PointerPosition, 
    /* moveX */ scala.Double, 
    /* moveY */ scala.Double, 
    scala.Unit
  ]
  type DragStartListener = js.ThisFunction1[/* this */ Dragger, /* pointer */ PointerPosition, scala.Unit]
  type PrerenderListener = js.ThisFunction1[
    /* this */ Illustration, 
    /* context */ stdLib.CanvasRenderingContext2D | stdLib.SVGSVGElement, 
    scala.Unit
  ]
  type ResizeListener = js.ThisFunction2[
    /* this */ Illustration, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
}
