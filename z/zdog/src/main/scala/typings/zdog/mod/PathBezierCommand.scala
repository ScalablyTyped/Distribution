package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBezierCommand
  extends StObject
     with PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-bezier Zdog Shape API} */
  var bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]
}
object PathBezierCommand {
  
  inline def apply(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBezierCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBezierCommand] (val x: Self) extends AnyVal {
    
    inline def setBezier(value: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): Self = StObject.set(x, "bezier", value.asInstanceOf[js.Any])
  }
}
