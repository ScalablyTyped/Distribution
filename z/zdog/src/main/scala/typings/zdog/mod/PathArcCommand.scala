package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathArcCommand extends PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-arc Zdog Shape API} */
  var arc: js.Tuple2[VectorOptions, VectorOptions] = js.native
}
object PathArcCommand {
  
  @scala.inline
  def apply(arc: js.Tuple2[VectorOptions, VectorOptions]): PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArcCommand]
  }
  
  @scala.inline
  implicit class PathArcCommandMutableBuilder[Self <: PathArcCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: js.Tuple2[VectorOptions, VectorOptions]): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
  }
}
