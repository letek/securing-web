// // mark task as done
// $('#todos-table').on('change', 'input[type="checkbox"]', function () {
//     var checkBox = $(this);
//     if (checkBox.prop('checked')) {
//         var doneItemId = $(this).parents('tr').find('input[type="hidden"]').val();
//
//         $.ajax({
//             url: '/main2/' + doneItemId,
//             type: 'PUT',
//             async: false,
//             success: function (result) {
//                 checkBox.parent().parent().addClass('remove');
//                 var doneItem = checkBox.parent().parent().find('td[class="todo-name"]').text();
//                 done(doneItem);
//             },
//             error: function (error) {
//                 checkBox.prop('checked', false);
//                 alert('Todos cannot be updated !');
//             }
//         });
//
//     }
// });
//
// function done(doneItem) {
//     var done = doneItem;
//     var markup = '<tr><td>' + doneItem + '</td></tr>';
//     $('#done-items').append(markup);
//     $('.remove').remove();
// }