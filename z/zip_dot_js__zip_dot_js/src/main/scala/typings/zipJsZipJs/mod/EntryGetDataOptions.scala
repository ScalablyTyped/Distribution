package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to `Entry#getData()` and `ZipFileEntry.get*()`.
  */
trait EntryGetDataOptions
  extends StObject
     with EntryDataOnprogressOptions
     with ZipReaderOptions
     with WorkerConfiguration
object EntryGetDataOptions {
  
  inline def apply(): EntryGetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryGetDataOptions]
  }
}
