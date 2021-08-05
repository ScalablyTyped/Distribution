package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArcCommand
  extends StObject
     with PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-arc Zdog Shape API} */
  var arc: js.Tuple2[VectorOptions, VectorOptions]
}
object PathArcCommand {
  
  inline def apply(arc: js.Tuple2[VectorOptions, VectorOptions]): PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArcCommand]
  }
  
  extension [Self <: PathArcCommand](x: Self) {
    
    inline def setArc(value: js.Tuple2[VectorOptions, VectorOptions]): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
  }
}
