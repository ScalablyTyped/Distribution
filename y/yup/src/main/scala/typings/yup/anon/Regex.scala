package typings.yup.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regex extends StObject {
  
  var regex: RegExp
}
object Regex {
  
  inline def apply(regex: RegExp): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  extension [Self <: Regex](x: Self) {
    
    inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
