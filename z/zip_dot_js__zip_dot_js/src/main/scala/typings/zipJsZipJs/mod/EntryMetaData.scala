package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.Map
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryMetaData extends StObject {
  
  /**
    * The comment of the entry.
    */
  var comment: String
  
  /**
    * `true` if the comment is encoded in UTF-8.
    */
  var commentUTF8: Boolean
  
  /**
    * The size of the compressed data in bytes.
    */
  var compressedSize: Double
  
  /**
    * The creation date.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * `true` if the entry is a directory.
    */
  var directory: Boolean
  
  /**
    * The number of the disk where the entry data starts.
    */
  var diskNumberStart: Double
  
  /**
    * `true` if the content of the entry is encrypted.
    */
  var encrypted: Boolean
  
  /**
    * The external file attribute (raw).
    */
  var externalFileAttribute: Double
  
  /**
    * The extra field.
    */
  var extraField: js.UndefOr[Map[Double, js.typedarray.Uint8Array]] = js.undefined
  
  /**
    * The filename of the entry.
    */
  var filename: String
  
  /**
    * `true` if the filename is encoded in UTF-8.
    */
  var filenameUTF8: Boolean
  
  /**
    * Returns the content of the entry
    * 
    * @param writer The {@link Writer} instance used to write the content of the entry.
    * @param options The options.
    * @returns A promise resolving to the type to data associated to `writer`.
    */
  var getData: js.UndefOr[
    js.Function2[
      /* writer */ Writer[Any] | WritableWriter | WritableStream[Any] | (AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]), 
      /* options */ js.UndefOr[EntryGetDataOptions], 
      js.Promise[Any]
    ]
  ] = js.undefined
  
  /**
    * The internal file attribute (raw).
    */
  var internalFileAttribute: Double
  
  /**
    * The last access date.
    */
  var lastAccessDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last modification date.
    */
  var lastModDate: js.Date
  
  /**
    * `true` if `internalFileAttribute` and `externalFileAttribute` are compatible with MS-DOS format.
    */
  var msDosCompatible: Boolean
  
  /**
    * The byte offset of the entry.
    */
  var offset: Double
  
  /**
    * The comment of the entry (raw).
    */
  var rawComment: js.typedarray.Uint8Array
  
  /**
    * The creation date (raw).
    */
  var rawCreationDate: js.UndefOr[Double | js.BigInt] = js.undefined
  
  /**
    * The extra field (raw).
    */
  var rawExtraField: js.typedarray.Uint8Array
  
  /**
    * The filename of the entry (raw).
    */
  var rawFilename: js.typedarray.Uint8Array
  
  /**
    * The last access date (raw).
    */
  var rawLastAccessDate: js.UndefOr[Double | js.BigInt] = js.undefined
  
  /**
    * The last modification date (raw).
    */
  var rawLastModDate: Double | js.BigInt
  
  /**
    * The signature (CRC32 checksum) of the content.
    */
  var signature: Double
  
  /**
    * The size of the decompressed data in bytes.
    */
  var uncompressedSize: Double
  
  /**
    * The "Version" field.
    */
  var version: Double
  
  /**
    * The "Version made by" field.
    */
  var versionMadeBy: Double
  
  /**
    * `true` if the entry is using Zip64.
    */
  var zip64: Boolean
}
object EntryMetaData {
  
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
  ): EntryMetaData = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], commentUTF8 = commentUTF8.asInstanceOf[js.Any], compressedSize = compressedSize.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], diskNumberStart = diskNumberStart.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], externalFileAttribute = externalFileAttribute.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filenameUTF8 = filenameUTF8.asInstanceOf[js.Any], internalFileAttribute = internalFileAttribute.asInstanceOf[js.Any], lastModDate = lastModDate.asInstanceOf[js.Any], msDosCompatible = msDosCompatible.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawComment = rawComment.asInstanceOf[js.Any], rawExtraField = rawExtraField.asInstanceOf[js.Any], rawFilename = rawFilename.asInstanceOf[js.Any], rawLastModDate = rawLastModDate.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionMadeBy = versionMadeBy.asInstanceOf[js.Any], zip64 = zip64.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetaData]
  }
  
  extension [Self <: EntryMetaData](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUTF8(value: Boolean): Self = StObject.set(x, "commentUTF8", value.asInstanceOf[js.Any])
    
    inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDiskNumberStart(value: Double): Self = StObject.set(x, "diskNumberStart", value.asInstanceOf[js.Any])
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setExternalFileAttribute(value: Double): Self = StObject.set(x, "externalFileAttribute", value.asInstanceOf[js.Any])
    
    inline def setExtraField(value: Map[Double, js.typedarray.Uint8Array]): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    inline def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUTF8(value: Boolean): Self = StObject.set(x, "filenameUTF8", value.asInstanceOf[js.Any])
    
    inline def setGetData(
      value: (/* writer */ Writer[Any] | WritableWriter | WritableStream[Any] | (AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]), /* options */ js.UndefOr[EntryGetDataOptions]) => js.Promise[Any]
    ): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setInternalFileAttribute(value: Double): Self = StObject.set(x, "internalFileAttribute", value.asInstanceOf[js.Any])
    
    inline def setLastAccessDate(value: js.Date): Self = StObject.set(x, "lastAccessDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessDateUndefined: Self = StObject.set(x, "lastAccessDate", js.undefined)
    
    inline def setLastModDate(value: js.Date): Self = StObject.set(x, "lastModDate", value.asInstanceOf[js.Any])
    
    inline def setMsDosCompatible(value: Boolean): Self = StObject.set(x, "msDosCompatible", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRawComment(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawComment", value.asInstanceOf[js.Any])
    
    inline def setRawCreationDate(value: Double | js.BigInt): Self = StObject.set(x, "rawCreationDate", value.asInstanceOf[js.Any])
    
    inline def setRawCreationDateUndefined: Self = StObject.set(x, "rawCreationDate", js.undefined)
    
    inline def setRawExtraField(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawExtraField", value.asInstanceOf[js.Any])
    
    inline def setRawFilename(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawFilename", value.asInstanceOf[js.Any])
    
    inline def setRawLastAccessDate(value: Double | js.BigInt): Self = StObject.set(x, "rawLastAccessDate", value.asInstanceOf[js.Any])
    
    inline def setRawLastAccessDateUndefined: Self = StObject.set(x, "rawLastAccessDate", js.undefined)
    
    inline def setRawLastModDate(value: Double | js.BigInt): Self = StObject.set(x, "rawLastModDate", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Double): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUncompressedSize(value: Double): Self = StObject.set(x, "uncompressedSize", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionMadeBy(value: Double): Self = StObject.set(x, "versionMadeBy", value.asInstanceOf[js.Any])
    
    inline def setZip64(value: Boolean): Self = StObject.set(x, "zip64", value.asInstanceOf[js.Any])
  }
}
