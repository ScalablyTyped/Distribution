package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to {@link Entry#getData} and `{@link ZipFileEntry}.get*`.
  */
trait EntryGetDataCheckPasswordOptions
  extends StObject
     with EntryGetDataOptions
     with ZipReaderCheckPasswordOptions
object EntryGetDataCheckPasswordOptions {
  
  inline def apply(checkPasswordOnly: Boolean): EntryGetDataCheckPasswordOptions = {
    val __obj = js.Dynamic.literal(checkPasswordOnly = checkPasswordOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryGetDataCheckPasswordOptions]
  }
}
