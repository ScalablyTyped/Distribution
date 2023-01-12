package typings.zdog.mod

import typings.zdog.zdogBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOptions
  extends StObject
     with AnchorOptions {
  
  /**
    * Shows or hides the shape when its backface is visible.
    * @default true
    * @see {@link https://zzz.dog/api#shape-backface Zdog API}
    */
  val backface: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * Closes the path from the last point back to the first.
    * @default true
    * @see {@link https://zzz.dog/api#shape-closed Zdog API}
    * @see {@link https://zzz.dog/shapes#shape-closed Zdog Shapes API}
    */
  val closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets shape stroke and fill color.
    * Set to any color string — hex code, `rgb()`, `hsla()`, etc.
    * @default '#333'
    * @see {@link https://zzz.dog/api#shape-color Zdog API}
    */
  val color: js.UndefOr[String] = js.undefined
  
  /**
    * Renders the inner shape area.
    * @default false
    * @see {@link https://zzz.dog/api#shape-fill Zdog API}
    */
  val fill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A {@link Vector} used to determine where the front of the shape is.
    * Useful for changing how {@link backface} works for custom `Shape`s.
    * @default {z: 1}
    * @see {@link https://zzz.dog/api#shape-front Zdog API}
    */
  val front: js.UndefOr[VectorOptions] = js.undefined
  
  /**
    * Defines the shape.
    * @see {@link https://zzz.dog/shapes#shape-path Zdog Shape API}
    */
  val path: js.UndefOr[js.Array[PathCommand]] = js.undefined
  
  /**
    * Renders the shape line and sets line width.
    * Set to `0` or `false` to disable.
    * @default 1
    * @see {@link https://zzz.dog/api#shape-stroke Zdog API}
    */
  val stroke: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * Shows or hides shape. Does not affect child items.
    * @default true
    * @see {@link https://zzz.dog/api#shape-visible Zdog API}
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}
object ShapeOptions {
  
  inline def apply(): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeOptions] (val x: Self) extends AnyVal {
    
    inline def setBackface(value: Boolean | String): Self = StObject.set(x, "backface", value.asInstanceOf[js.Any])
    
    inline def setBackfaceUndefined: Self = StObject.set(x, "backface", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFront(value: VectorOptions): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
    
    inline def setPath(value: js.Array[PathCommand]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: PathCommand*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setStroke(value: Double | `false`): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
