package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to  {@link ZipWriter#close}.
  */
trait ZipWriterCloseOptions
  extends StObject
     with EntryOnprogressOptions {
  
  /**
    * `true` to prevent closing of {@link WritableWriter#writable}.
    * 
    * @defaultValue false
    */
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to use Zip64 to write the entries directory.
    * 
    * @defaultValue false
    */
  var zip64: js.UndefOr[Boolean] = js.undefined
}
object ZipWriterCloseOptions {
  
  inline def apply(): ZipWriterCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipWriterCloseOptions]
  }
  
  extension [Self <: ZipWriterCloseOptions](x: Self) {
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setZip64(value: Boolean): Self = StObject.set(x, "zip64", value.asInstanceOf[js.Any])
    
    inline def setZip64Undefined: Self = StObject.set(x, "zip64", js.undefined)
  }
}
