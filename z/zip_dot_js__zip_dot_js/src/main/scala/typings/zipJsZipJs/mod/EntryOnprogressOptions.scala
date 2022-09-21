package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to `ZipReader#getEntries()`, `ZipReader#getEntriesGenerator()`, and `ZipWriter#close()`.
  */
trait EntryOnprogressOptions extends StObject {
  
  /**
    * The function called each time an entry is read/written.
    * 
    * @param progress The entry index.
    * @param total The total number of entries.
    * @param entry The entry being read/written.
    * @returns An empty promise or `undefined`.
    */
  var onprogress: js.UndefOr[
    js.Function3[
      /* progress */ Double, 
      /* total */ Double, 
      /* entry */ Entry, 
      js.UndefOr[js.Promise[Unit]]
    ]
  ] = js.undefined
}
object EntryOnprogressOptions {
  
  inline def apply(): EntryOnprogressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryOnprogressOptions]
  }
  
  extension [Self <: EntryOnprogressOptions](x: Self) {
    
    inline def setOnprogress(
      value: (/* progress */ Double, /* total */ Double, /* entry */ Entry) => js.UndefOr[js.Promise[Unit]]
    ): Self = StObject.set(x, "onprogress", js.Any.fromFunction3(value))
    
    inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
  }
}
