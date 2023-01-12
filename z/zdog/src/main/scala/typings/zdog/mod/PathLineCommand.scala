package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLineCommand
  extends StObject
     with PathCommand {
  
  /** @see {@link https://zzz.dog/shapes#shape-line Zdog Shape API} */
  var line: VectorOptions
}
object PathLineCommand {
  
  inline def apply(line: VectorOptions): PathLineCommand = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLineCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathLineCommand] (val x: Self) extends AnyVal {
    
    inline def setLine(value: VectorOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
