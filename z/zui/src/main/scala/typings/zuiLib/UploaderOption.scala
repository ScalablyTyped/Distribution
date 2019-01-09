package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uploader
  */
trait UploaderOption extends js.Object {
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  var browseByClickList: js.UndefOr[scala.Boolean] = js.undefined
  var browse_button: js.UndefOr[java.lang.String] = js.undefined
  var chunk_size: js.UndefOr[java.lang.String] = js.undefined
  var deleteActionOnDone: js.UndefOr[scala.Boolean] = js.undefined
  var deleteConfirm: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var dropPlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var drop_element: js.UndefOr[java.lang.String] = js.undefined
  var fileFormater: js.UndefOr[
    js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, scala.Unit]
  ] = js.undefined
  var fileIconCreator: js.UndefOr[
    js.Function3[
      /* fileType */ java.lang.String, 
      /* file */ FileObj, 
      /* uploader */ Uploader, 
      scala.Unit
    ]
  ] = js.undefined
  var fileList: js.UndefOr[java.lang.String] = js.undefined
  var fileTemplate: js.UndefOr[java.lang.String] = js.undefined
  var file_data_name: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[Anon_Maxfilesize] = js.undefined
  var flash_swf_url: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var limitFilesCount: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var max_retries: js.UndefOr[scala.Double] = js.undefined
  var multi_selection: js.UndefOr[scala.Boolean] = js.undefined
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var onChunkUploaded: js.UndefOr[
    js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit]
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Anon_Error, scala.Unit]] = js.undefined
  var onFileUploaded: js.UndefOr[
    js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, scala.Unit]
  ] = js.undefined
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onQueueChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, scala.Unit]] = js.undefined
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], scala.Unit]] = js.undefined
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, scala.Unit]] = js.undefined
  var previewImageIcon: js.UndefOr[scala.Boolean] = js.undefined
  var previewImageSize: js.UndefOr[Anon_Height] = js.undefined
  var qiniu: js.UndefOr[js.Object] = js.undefined
  var removeUploaded: js.UndefOr[scala.Boolean] = js.undefined
  var rename: js.UndefOr[scala.Boolean] = js.undefined
  var renameActionOnDone: js.UndefOr[scala.Boolean] = js.undefined
  var renameByClick: js.UndefOr[scala.Boolean] = js.undefined
  var renameExtension: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[Anon_Crop] = js.undefined
  var responseHandler: js.UndefOr[scala.Boolean | CallBack] = js.undefined
  var runtimes: js.UndefOr[java.lang.String] = js.undefined
  var sendFileId: js.UndefOr[scala.Boolean] = js.undefined
  var sendFileName: js.UndefOr[scala.Boolean] = js.undefined
  var silverlight_xap_url: js.UndefOr[java.lang.String] = js.undefined
  var staticFiles: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, scala.Unit]
  ] = js.undefined
  var unique_names: js.UndefOr[scala.Boolean] = js.undefined
  var uploadedMessage: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

