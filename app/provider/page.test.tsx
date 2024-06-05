/**
 * @jest-environment jsdom
 */
import { render, screen } from "@testing-library/react";
import Page from "./page";

it("Test feedback form @tests:KXITM581M21BX838E298V4H5QZK7RFN", () => {
  render(<Page />);
  expect(screen.getByRole("heading")).toHaveTextContent("Provider App");
});
