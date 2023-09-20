Feature: User do search function to search into the system
#  //Homework 1
#  1. Vào trang dichvucong.gov.vn
#  2. Tìm kiếm “công dân” và nhấn Enter từ bàn phím
#  3. Đếm tổng số record kết quả tìm kiếm được và hiển thị dưới console (system.out.println)
#  //Homework 2
#  1. Tìm ra bài “Đăng ký tài khoản định danh điện tử mức độ 2 đối với công dân Việt Nam” và hiển thị trong console đang nằm ở dòng mấy, trang bao nhiêu (Sử dụng array 1 chiều trong java)
#  2. Mở chi tiết bài viết ở tab mới
#  3. Chuyển sang tab mới mở, chụp màn hình
#
  Scenario Outline: User do search function to search into the system
    Given User opens "Dịch vụ công" screen on the PC browser
    When User enter data at input search as "<text_search>"
    And User press enter from keyboard
    And Show the total number of the results
    Then Open the target article's details as "<expected_page>" in the new tab

    Examples:
    | text_search| expected_page |
    | công dân   |   Thủ tục cập nhật thông tin đăng ký công dân Việt Nam ở nước ngoài           |
