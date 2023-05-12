package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to the constructor of {@link ZipReader} and {@link Entry#getData}.
  */
trait ZipReaderCheckPasswordOptions extends StObject {
  
  /**
    * `true` to check only if the password is valid.
    *
    * @defaultValue false
    */
  var checkPasswordOnly: Boolean
}
object ZipReaderCheckPasswordOptions {
  
  inline def apply(checkPasswordOnly: Boolean): ZipReaderCheckPasswordOptions = {
    val __obj = js.Dynamic.literal(checkPasswordOnly = checkPasswordOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipReaderCheckPasswordOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipReaderCheckPasswordOptions] (val x: Self) extends AnyVal {
    
    inline def setCheckPasswordOnly(value: Boolean): Self = StObject.set(x, "checkPasswordOnly", value.asInstanceOf[js.Any])
  }
}
