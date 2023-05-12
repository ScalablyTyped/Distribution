package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry
  extends StObject
     with EntryMetaData {
  
  /**
    * Returns the content of the entry
    *
    * @param writer The {@link Writer} instance used to write the content of the entry.
    * @param options The options.
    * @returns A promise resolving to the type to data associated to `writer`.
    */
  /**
    * Tests if the password is valid.
    *
    * @param writer `undefined` or `null`.
    * @param options The options with `checkPasswordOnly` set to `true`.
    */
  var getData: js.UndefOr[
    js.Function2[
      /* writer */ Writer[Any] | WritableWriter | WritableStream[Any] | (AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]), 
      /* options */ js.UndefOr[EntryGetDataOptions], 
      js.Promise[Any]
    ]
  ] = js.undefined
}
object Entry {
  
  inline def apply(
    comment: String,
    commentUTF8: Boolean,
    compressedSize: Double,
    directory: Boolean,
    diskNumberStart: Double,
    encrypted: Boolean,
    externalFileAttribute: Double,
    filename: String,
    filenameUTF8: Boolean,
    internalFileAttribute: Double,
    lastModDate: js.Date,
    msDosCompatible: Boolean,
    offset: Double,
    rawComment: js.typedarray.Uint8Array,
    rawExtraField: js.typedarray.Uint8Array,
    rawFilename: js.typedarray.Uint8Array,
    rawLastModDate: Double | js.BigInt,
    signature: Double,
    uncompressedSize: Double,
    version: Double,
    versionMadeBy: Double,
    zip64: Boolean
  ): Entry = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], commentUTF8 = commentUTF8.asInstanceOf[js.Any], compressedSize = compressedSize.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], diskNumberStart = diskNumberStart.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], externalFileAttribute = externalFileAttribute.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filenameUTF8 = filenameUTF8.asInstanceOf[js.Any], internalFileAttribute = internalFileAttribute.asInstanceOf[js.Any], lastModDate = lastModDate.asInstanceOf[js.Any], msDosCompatible = msDosCompatible.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawComment = rawComment.asInstanceOf[js.Any], rawExtraField = rawExtraField.asInstanceOf[js.Any], rawFilename = rawFilename.asInstanceOf[js.Any], rawLastModDate = rawLastModDate.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionMadeBy = versionMadeBy.asInstanceOf[js.Any], zip64 = zip64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    inline def setGetData(
      value: (/* writer */ Writer[Any] | WritableWriter | WritableStream[Any] | (AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]), /* options */ js.UndefOr[EntryGetDataOptions]) => js.Promise[Any]
    ): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
  }
}
