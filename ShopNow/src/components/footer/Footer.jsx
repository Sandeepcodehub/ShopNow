import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";

export default function Footer() {
  return (
    <footer className="flex justify-center items-center py-4 font-primary text-gray-700">
      Shop with
      <FontAwesomeIcon
        icon={faHeart}
        className="text-red-600 mx-1 animate-pulse"
        aria-hidden="true"
      />
      at
      <a
        href="/"
        target="_self"
        rel="noreferrer"
        className="text-primary font-semibold px-1 transition-colors duration-300 hover:text-dark"
      >
        ShopNow
      </a>
    </footer>
  );
}
