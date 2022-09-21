package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to `ZipReader#getEntries()` and `ZipReader#getEntriesGenerator()`.
  */
trait ZipReaderGetEntriesOptions
  extends StObject
     with GetEntriesOptions
     with EntryOnprogressOptions
object ZipReaderGetEntriesOptions {
  
  inline def apply(): ZipReaderGetEntriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipReaderGetEntriesOptions]
  }
}
