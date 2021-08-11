ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
NodeLink requestCommentRangeStartNode = new NodeLink();
requestCommentRangeStartNode.setNodeId("0.3.0.3");

DocumentPosition requestCommentRangeStart = new DocumentPosition();
requestCommentRangeStart.setNode(requestCommentRangeStartNode);
requestCommentRangeStart.setOffset(0);

NodeLink requestCommentRangeEndNode = new NodeLink();
requestCommentRangeEndNode.setNodeId("0.3.0.3");

DocumentPosition requestCommentRangeEnd = new DocumentPosition();
requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
requestCommentRangeEnd.setOffset(0);

CommentInsert requestComment = new CommentInsert();
requestComment.setRangeStart(requestCommentRangeStart);
requestComment.setRangeEnd(requestCommentRangeEnd);
requestComment.setInitial("IA");
requestComment.setAuthor("Imran Anwar");
requestComment.setText("A new Comment");

InsertCommentRequest insertRequestRequest = new InsertCommentRequest("Sample.docx",requestComment,null,null,null,null,null,null,null);
wordsApi.insertComment(insertRequestRequest);