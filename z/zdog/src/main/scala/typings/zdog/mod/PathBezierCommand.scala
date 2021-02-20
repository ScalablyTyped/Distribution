package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathBezierCommand extends PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-bezier Zdog Shape API} */
  var bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions] = js.native
}
object PathBezierCommand {
  
  @scala.inline
  def apply(bezier: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): PathBezierCommand = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBezierCommand]
  }
  
  @scala.inline
  implicit class PathBezierCommandMutableBuilder[Self <: PathBezierCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBezier(value: js.Tuple3[VectorOptions, VectorOptions, VectorOptions]): Self = StObject.set(x, "bezier", value.asInstanceOf[js.Any])
  }
}
