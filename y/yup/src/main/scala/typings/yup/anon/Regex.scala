package typings.yup.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regex extends StObject {
  
  var regex: RegExp = js.native
}
object Regex {
  
  @scala.inline
  def apply(regex: RegExp): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  @scala.inline
  implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
