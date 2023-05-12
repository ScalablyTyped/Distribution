package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to the constructor of {@link ZipReader}, and `{@link ZipDirectory}#import*`.
  */
trait ZipReaderConstructorOptions
  extends StObject
     with ZipReaderOptions
     with GetEntriesOptions
     with WorkerConfiguration {
  
  /**
    * `true` to extract the appended data into {@link ZipReader#appendedData}.
    *
    * @defaultValue false
    */
  var extractAppendedData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to extract the prepended data into {@link ZipReader#prependedData}.
    *
    * @defaultValue false
    */
  var extractPrependedData: js.UndefOr[Boolean] = js.undefined
}
object ZipReaderConstructorOptions {
  
  inline def apply(): ZipReaderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipReaderConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipReaderConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setExtractAppendedData(value: Boolean): Self = StObject.set(x, "extractAppendedData", value.asInstanceOf[js.Any])
    
    inline def setExtractAppendedDataUndefined: Self = StObject.set(x, "extractAppendedData", js.undefined)
    
    inline def setExtractPrependedData(value: Boolean): Self = StObject.set(x, "extractPrependedData", value.asInstanceOf[js.Any])
    
    inline def setExtractPrependedDataUndefined: Self = StObject.set(x, "extractPrependedData", js.undefined)
  }
}
